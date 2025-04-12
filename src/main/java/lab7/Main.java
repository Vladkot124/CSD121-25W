package lab7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * Get all recipes that can be made in 15 minutes or less.
     *
     * @param dataService a service that provides access to recipe data
     * @return a list of quick recipes
     */
    public static List<Recipe> getQuickRecipes(DataService dataService) {
        try {
            var recipes = dataService.getRecipes();
            return recipes.stream()
                    .filter(r -> r.totalTime() <= 15)
                    .toList();
        } catch (Exception e) {
            logger.error("Error while getting quick recipes: " + e.getMessage());
            logger.debug("Stack trace: " + Arrays.toString(e.getStackTrace()));
            return List.of();
        }
    }

    /**
     * Search for recipes that contain the given term in name or description.
     *
     * @param dataService the service used to retrieve recipes
     * @param searchTerm  the keyword to search for
     * @return a list of matching recipes, or empty list on error
     */
    public static List<Recipe> searchRecipes(DataService dataService, String searchTerm) {
        try {
            var recipes = dataService.getRecipes();
            return recipes.stream()
                    .filter(r -> r.name().toLowerCase().contains(searchTerm.toLowerCase())
                            || r.description().toLowerCase().contains(searchTerm.toLowerCase()))
                    .toList();
        } catch (Exception e) {
            logger.error("Error during recipe search: " + e.getMessage());
            logger.debug("Stack trace: " + Arrays.toString(e.getStackTrace()));
            return List.of();
        }
    }

    public static void main(String[] args) {

        var quickRecipes = getQuickRecipes(new SqliteDataService());
        System.out.println("Quick Recipes:");
        quickRecipes.forEach(System.out::println);


        var searchResults = searchRecipes(new SqliteDataService(), "chicken");
        System.out.println("\nSearch Results for 'chicken':");
        searchResults.forEach(System.out::println);
    }
}
