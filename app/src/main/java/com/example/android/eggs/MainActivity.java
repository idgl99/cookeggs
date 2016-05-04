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
     * method HandleClick is invoked by all ImageButtons clicks
     * using a switch statement the relevant recipe and heading texts
     * are extracted and placed in Strings recipeText and headingText
     * these Strings are then passed to the RecipeActivity class with
     * putExtra
     *
     */
    public void HandleClick(View view) {
        Intent goToRecipe = new Intent();
        goToRecipe.setClass(this, RecipeActivity.class);
        String recipeText = "";
        String headingText = "";
        // Check the ImageButton id and update recipeText and headingText Strings
        switch (view.getId()) {
            case R.id.imageHardboiled:
                recipeText = getString(R.string.recipe_hardboiled);
                headingText = getString(R.string.hardboiled);
                break;
            case R.id.imageFried:
                recipeText = getString(R.string.recipe_fried);
                headingText = getString(R.string.fried);
                break;
            case R.id.imageScrambled:
                recipeText = getString(R.string.recipe_scrambled);
                headingText = getString(R.string.scrambled);
                break;
            case R.id.imagePoached:
                recipeText = getString(R.string.recipe_poached);
                headingText = getString(R.string.poached);
                break;
            case R.id.imageOmelet:
                recipeText = getString(R.string.recipe_omelet);
                headingText = getString(R.string.omelet);
                break;
            default:

        }
        goToRecipe.putExtra("recipe", recipeText);
        goToRecipe.putExtra("heading", headingText);
        startActivity(goToRecipe);
    }
}
