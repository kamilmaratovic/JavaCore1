package z_helpers;

import com.github.javafaker.Faker;
import models_restAssured_APItesting_DB.Category;
import models_restAssured_APItesting_DB.Pet;
import models_restAssured_APItesting_DB.Status;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestObjectGenerator {
    public static String randomString(int length){

            boolean useLetters = true;
            boolean useNumbers = false;
            return  RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static Pet genarateRandomPet(){
        Faker faker = new Faker();
        Random random = new Random();
        String[]photoUrls = {faker.internet().image()+" , "+faker.internet().image()};
        Pet pet = new Pet(faker.cat().name(), photoUrls);
        pet.setStatus(Status.pending);
        Category category = new Category(faker.cat().breed(), random.nextLong());
        pet.setCategory(category);
        return pet;
    }
}
