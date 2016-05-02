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
        /**
         *  The remaining code produces a pop-up message
         *  concerning whether or not the users device
         *  is at least on Andoid level KitKat or later
         */
        int duration = Toast.LENGTH_SHORT;
        int currentapiVersion = android.os.Build.VERSION.SDK_INT;
        CharSequence text1 = "Your Android version is KitKat or later";
        CharSequence text2 = "Your Android is earlier than KitKat";
        Toast toast;
        if (currentapiVersion >= Build.VERSION_CODES.KITKAT){
            toast = Toast.makeText(context, (CharSequence) text1, duration);
        } else {
            toast = Toast.makeText(context, (CharSequence) text2, duration);
        }
            toast.show();
    }

    /**
     *  method invoked when ImageButton "Scrambled" is clicked
     */
    public void scrambled(View v) {
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
    public void poached(View v) {
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
    public void hardboiled(View v) {
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
    public void fried(View v) {
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
    public void omelet(View v) {
        Intent goToRecipe = new Intent();
        goToRecipe.setClass(this, RecipeActivity.class);
        String recipeText = getString(R.string.recipe_omelet);
        goToRecipe.putExtra("recipe", recipeText);
        String headingText = getString(R.string.omelet);
        goToRecipe.putExtra("heading", headingText);
        startActivity(goToRecipe);
    }
}


