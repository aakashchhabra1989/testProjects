package com.soap.rpcStyle;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.soap.rpcStyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}