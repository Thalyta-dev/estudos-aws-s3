package br.com.br.estudosaws.controller;


import com.amazonaws.services.s3.AmazonS3;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/s3")
public class AwsController {

    private AmazonS3 amazonS3;

    public AwsController(AmazonS3 amazonS3) {
        this.amazonS3 = amazonS3;
    }

    @PostMapping
    public void note(@RequestParam  String name, @RequestParam  String content){

        amazonS3.putObject("s3springboothaly", name + ".txt", content);
    }
}
