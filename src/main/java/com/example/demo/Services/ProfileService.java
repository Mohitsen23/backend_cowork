package com.example.demo.Services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Models.ProfilePics;
import com.example.demo.Models.Signup;

public interface ProfileService {

	   ProfilePics uploadImage(MultipartFile file, Signup email) throws IOException ;

	byte[] downloadImage(String fileName);

}
