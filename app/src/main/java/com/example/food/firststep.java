package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class firststep extends AppCompatActivity {

    private ImageSlider imageSliders;

    ImageView location, MENU;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firststep);

        MENU = findViewById(R.id.Menu);
        MENU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(firststep.this , MenuList.class);
                startActivity(intent);
            }
        });

//**************************************************************************************************

        location = findViewById(R.id.Location);

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(firststep.this , MapsActivity.class);
                startActivity(intent);
                finish();
            }
        });
//**************************************************************************************************

//        #################################################################################################

        ArrayList<SlideModel> imageList = new ArrayList<>();

// You can add images with or without titles
        //        imageList.add(new SlideModel("https://bit.ly/3fLJf72", "And people do that.",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.chilichicken, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.briyani, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.pizza, ScaleTypes.FIT ));

        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);
//********************************************************************************************************************
        ArrayList<SlideModel> imageLists = new ArrayList<>();

        imageLists.add(new SlideModel(R.drawable.panir, ScaleTypes.FIT));
        imageLists.add(new SlideModel(R.drawable.burgar, ScaleTypes.FIT));
        imageLists.add(new SlideModel(R.drawable.sandwhich, ScaleTypes.FIT));

         imageSliders = findViewById(R.id.imageSlides);
                imageSliders.setImageList(imageLists);

//*********************************************************************************************************************
        ArrayList<SlideModel> imageList2 = new ArrayList<>();

        imageList2.add(new SlideModel(R.drawable.dosa, ScaleTypes.FIT));
        imageList2.add(new SlideModel(R.drawable.roll, ScaleTypes.FIT));
        imageList2.add(new SlideModel(R.drawable.panir, ScaleTypes.FIT ));

        ImageSlider imageSlider3;
        imageSlider3 = findViewById(R.id.image_sliderfirst);
        imageSlider3.setImageList(imageList2);
//*********************************************************************************************************************

        ArrayList<SlideModel> imageList3 = new ArrayList<>();

        imageList3.add(new SlideModel(R.drawable.momos, ScaleTypes.FIT));
        imageList3.add(new SlideModel(R.drawable.thali, ScaleTypes.FIT));
        imageList3.add(new SlideModel(R.drawable.burgar, ScaleTypes.FIT ));

        ImageSlider imageSlider4;
        imageSlider4 = findViewById(R.id.image_slidersec);
        imageSlider4.setImageList(imageList2);
//*********************************************************************************************************************

        ArrayList<SlideModel> imageList4 = new ArrayList<>();

        imageList4.add(new SlideModel(R.drawable.briyani, ScaleTypes.FIT));
        imageList4.add(new SlideModel(R.drawable.chinieses, ScaleTypes.FIT));
        imageList4.add(new SlideModel(R.drawable.momos, ScaleTypes.FIT ));

        ImageSlider imageSlider5;
        imageSlider5 = findViewById(R.id.image_sliderthird);
        imageSlider5.setImageList(imageList2);
//*********************************************************************************************************************

        ArrayList<SlideModel> imageList5 = new ArrayList<>();

        imageList5.add(new SlideModel(R.drawable.chicken, ScaleTypes.FIT));
        imageList5.add(new SlideModel(R.drawable.chilichicken, ScaleTypes.FIT));
        imageList5.add(new SlideModel(R.drawable.chinieses, ScaleTypes.FIT ));

        ImageSlider imageSlider6;
        imageSlider6 = findViewById(R.id.image_sliderfifth);
        imageSlider6.setImageList(imageList2);
//*********************************************************************************************************************


        ArrayList<SlideModel> imageList6 = new ArrayList<>();

        imageList6.add(new SlideModel(R.drawable.roll, ScaleTypes.FIT));
        imageList6.add(new SlideModel(R.drawable.chowmin, ScaleTypes.FIT));
        imageList6.add(new SlideModel(R.drawable.sandwhich, ScaleTypes.FIT ));

        ImageSlider imageSlider7;
        imageSlider7 = findViewById(R.id.image_slidersixth);
        imageSlider7.setImageList(imageList2);
//*********************************************************************************************************************

        ArrayList<SlideModel> imageList7 = new ArrayList<>();

        imageList7.add(new SlideModel(R.drawable.icecream, ScaleTypes.FIT));
        imageList7.add(new SlideModel(R.drawable.sandwhich, ScaleTypes.FIT));
        imageList7.add(new SlideModel(R.drawable.briyani, ScaleTypes.FIT ));

        ImageSlider imageSlider8;
        imageSlider8 = findViewById(R.id.image_sliderseventh);
        imageSlider8.setImageList(imageList2);
//*********************************************************************************************************************


        ArrayList<SlideModel> imageList8 = new ArrayList<>();

        imageList8.add(new SlideModel(R.drawable.burgar, ScaleTypes.FIT));
        imageList8.add(new SlideModel(R.drawable.pizza, ScaleTypes.FIT));
        imageList8.add(new SlideModel(R.drawable.dosa, ScaleTypes.FIT ));

        ImageSlider imageSlider9;
        imageSlider9 = findViewById(R.id.image_sliderEights);
        imageSlider9.setImageList(imageList2);
//*********************************************************************************************************************

        ArrayList<SlideModel> imageList9 = new ArrayList<>();

        imageList9.add(new SlideModel(R.drawable.icecream, ScaleTypes.FIT));
        imageList9.add(new SlideModel(R.drawable.sandwhich, ScaleTypes.FIT));
        imageList9.add(new SlideModel(R.drawable.briyani, ScaleTypes.FIT ));

        ImageSlider imageSlider10;
        imageSlider10 = findViewById(R.id.image_sliderNineth);
        imageSlider10.setImageList(imageList2);
//*********************************************************************************************************************
    }
}