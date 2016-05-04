package com.example.android.eggs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.android.eggs.R;

/**
 * the text in the recipeheading and recipebody TextViews are
 * updated with the stringExtra parameters "recipe" and "heading"
 * passed from MainActivity
 */

public class RecipeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        Intent caller = getIntent();
        String heading = caller.getStringExtra("heading");
        TextView textHeading = (TextView) findViewById(R.id.recipeheading);
        textHeading.setText(heading);
        String recipe = caller.getStringExtra("recipe");
        TextView textRecipe = (TextView) findViewById(R.id.recipebody);
        textRecipe.setText(recipe);
    }
}


