package com.zsj.a3dbanner.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.zsj.a3dbanner.App;
import com.zsj.a3dbanner.R;
import com.zsj.a3dbanner.loader.GlideImageLoader;
import com.zsj.banner.Banner;
import com.zsj.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

public class CustomBannerActivity extends AppCompatActivity {
    Banner banner1,banner2,banner3;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_banner);
        List<Integer> list=new ArrayList<>();
        list.add(R.mipmap.b1);
        list.add(R.mipmap.b2);
        list.add(R.mipmap.b3);
        banner1 = (Banner) findViewById(R.id.banner1);
        banner2 = (Banner) findViewById(R.id.banner2);
        banner3 = (Banner) findViewById(R.id.banner3);

        banner1.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();

        banner2.setImages(list)
                .setImageLoader(new GlideImageLoader())
                .start();

//        banner3.setImages(list)
//                .setBannerTitles(App.titles)
//                .setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE)
//                .setImageLoader(new GlideImageLoader())
//                .start();
    }
}
