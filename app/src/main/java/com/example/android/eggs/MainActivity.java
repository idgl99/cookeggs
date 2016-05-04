package com.example.android.eggs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
     }

    /**
     *  method invoked when ImageButton "Scrambled" is clicked
     */
    public void show_scrambled_recipe(View v) {
        Intent goToRecipe = new Intent();
        goToRecipe.setClass(this, RecipeActivity.class);
        String recipeText = getString(R.string.recipe_scrambled);
        goToRecipe.putExtra("recipe", recipeText);
        String headingText = getString(R.string.scrambled);
        goToRecipe.putExtra("heading", headingText);
        startActivity(goToRecipe);
    }

    /**
     *  method invoked when ImageButton "Poached" is clicked
     */
    public void show_poached_recipe(View v) {
        Intent goToRecipe = new Intent();
        goToRecipe.setClass(this, RecipeActivity.class);
        String recipeText = getString(R.string.recipe_poached);
        goToRecipe.putExtra("recipe", recipeText);
        String headingText = getString(R.string.poached);
        goToRecipe.putExtra("heading", headingText);
        startActivity(goToRecipe);
    }

    /**
     *  method invoked when ImageButton "Hard-Boiled" is clicked
     */
    public void show_hardboiled_recipe(View v) {
        Intent goToRecipe = new Intent();
        goToRecipe.setClass(this, RecipeActivity.class);
        String recipeText = getString(R.string.recipe_hardboiled);
        goToRecipe.putExtra("recipe", recipeText);
        String headingText = getString(R.string.hardboiled);
        goToRecipe.putExtra("heading", headingText);
        startActivity(goToRecipe);
    }

    /**
     *  method invoked when ImageButton "Fried" is clicked
     */
    public void show_fried_recipe(View v) {
        Intent goToRecipe = new Intent();
        goToRecipe.setClass(this, RecipeActivity.class);
        String recipeText = getString(R.string.recipe_fried);
        goToRecipe.putExtra("recipe", recipeText);
        String headingText = getString(R.string.fried);
        goToRecipe.putExtra("heading", headingText);
        startActivity(goToRecipe);
    }

    /**
     *  method invoked when ImageButton "Omelet" is clicked
     */
    public void show_omelet_recipe(View v) {
        Intent goToRecipe = new Intent();
        goToRecipe.setClass(this, RecipeActivity.class);
        String recipeText = getString(R.string.recipe_omelet);
        goToRecipe.putExtra("recipe", recipeText);
        String headingText = getString(R.string.omelet);
        goToRecipe.putExtra("heading", headingText);
        startActivity(goToRecipe);
    }
}


