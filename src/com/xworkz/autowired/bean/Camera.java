package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera 
{
	
	 @Autowired
	  private Lens lenc;
	 @Autowired
	 private Battery battery;
	 
	public Camera()
	{
		System.out.println("Assistant  is created");
	}
}
