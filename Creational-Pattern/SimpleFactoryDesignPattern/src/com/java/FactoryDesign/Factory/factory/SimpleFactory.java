package com.java.FactoryDesign.Factory.factory;

import com.java.FactoryDesign.Factory.Product.Media;
import com.java.FactoryDesign.Factory.Product.NewsPaper;
import com.java.FactoryDesign.Factory.Product.SocialMedia;
import com.java.FactoryDesign.Factory.Product.Television;

public class SimpleFactory {
    public static Media getMedia(String type){
        switch (type){
            case "NewsPaper":
                return new NewsPaper("newspaper");
            case "Television":
                return new Television("TV");
            case "SocialMedia":
                return new SocialMedia("socialMedia");
            default:
                throw new IllegalArgumentException("Media type is illegal");
        }
    }
}
