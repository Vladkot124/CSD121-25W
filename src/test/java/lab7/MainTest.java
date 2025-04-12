package lab7;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testGetQuickRecipesReturnsEmptyListIfNoData() {
        var recipes = Main.getQuickRecipes(List::of);
        assertEquals(0, recipes.size());
    }

    @Test
    void testGetQuickRecipesReturnsEmptyListIfNoQuickRecipes() {
        var recipes = Main.getQuickRecipes(() -> List.of(
                new Recipe(0, "", "", "", 4, 10, 10, 16),
                new Recipe(1, "", "", "", 4, 10, 10, 20),
                new Recipe(2, "", "", "", 4, 10, 10, 200)
        ));
        assertEquals(0, recipes.size());
    }

    @Test
    void testGetQuickRecipesReturnsAllRecipesIfAllQuick() {

        var recipes = Main.getQuickRecipes(() -> List.of(
                new Recipe(0, "", "", "", 4, 10, 10, 15),
                new Recipe(1, "", "", "", 4, 10, 10, 1),
                new Recipe(2, "", "", "", 4, 10, 10, 10)
        ));

        assertEquals(3, recipes.size());
    }

    @Test
    void testGetQuickRecipesWorksOnTypicalData() {

        var recipes = Main.getQuickRecipes(() -> List.of(
                        new Recipe(0, "", "", "", 4, 10, 10, 10),
                        new Recipe(1, "", "", "", 4, 10, 10, 15),
                        new Recipe(2, "", "", "", 4, 10, 10, 16),
                        new Recipe(3, "", "", "", 4, 10, 10, 20),
                        new Recipe(4, "", "", "", 4, 10, 10, 2343)
        ));

        assertEquals(2, recipes.size());

        // Verify that the two recipes we expected are in fact in the list
        assertEquals(0, recipes.get(0).id());
        assertEquals(1, recipes.get(1).id());
    }

    // TODO: test the searchRecipes method
    @Test
    void testSearchRecipesFindsByName() {
        var recipes = Main.searchRecipes(() -> List.of(
                new Recipe(1, "Chicken Soup", "Warm soup", "", 2, 5, 5, 15),
                new Recipe(2, "Beef Stew", "Hearty and rich", "", 3, 10, 10, 45)
        ), "chicken");

        assertEquals(1, recipes.size());
        assertEquals("Chicken Soup", recipes.get(0).name());
    }

    @Test
    void testSearchRecipesFindsByDescription() {
        var recipes = Main.searchRecipes(() -> List.of(
                new Recipe(3, "Veggie Stir Fry", "Crispy tofu with chicken flavor", "", 2, 5, 5, 20),
                new Recipe(4, "Pasta", "Classic Italian", "", 2, 5, 5, 25)
        ), "chicken");

        assertEquals(1, recipes.size());
        assertEquals(3, recipes.get(0).id());
    }

    @Test
    void testSearchRecipesIsCaseInsensitive() {
        var recipes = Main.searchRecipes(() -> List.of(
                new Recipe(5, "CHICKEN PASTA", "With cream", "", 2, 5, 5, 20)
        ), "chicken");

        assertEquals(1, recipes.size());
    }

    @Test
    void testSearchRecipesReturnsEmptyWhenNoMatches() {
        var recipes = Main.searchRecipes(() -> List.of(
                new Recipe(6, "Pizza", "Cheesy", "", 2, 5, 5, 20),
                new Recipe(7, "Burger", "Juicy", "", 2, 5, 5, 15)
        ), "chicken");

        assertEquals(0, recipes.size());
    }

    @Test
    void testSearchRecipesHandlesExceptionsGracefully() {
        var recipes = Main.searchRecipes(() -> {
            throw new RuntimeException("Fake error");
        }, "chicken");

        assertEquals(0, recipes.size());
    }
}