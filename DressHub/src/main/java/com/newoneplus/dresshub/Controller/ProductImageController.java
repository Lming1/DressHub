package com.newoneplus.dresshub.Controller;


import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductImageController {
    private ResourceLoader resourceLoader = new DefaultResourceLoader();

    @ResponseBody
    @RequestMapping(value = "/product_image/{filename}",  produces = "image/jpg")
    public Resource loadImage(@PathVariable("filename") String filename) {
        return resourceLoader.getResource("file:/product_image/" +filename);
    }

}
