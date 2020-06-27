package com.hyh.IO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class IOTest08 {
	public static void main(String[] args) {
		byte[] dest = null;
		ByteArrayOutputStream baos = null;
		
		try {
			baos = new ByteArrayOutputStream();
			String msg = "show me the codehahaha";
			byte[] datas = msg.getBytes();
			
			baos.write(datas,0,datas.length);
			baos.flush();
			dest = baos.toByteArray();
			System.out.println(dest.length+"-----"+new String(dest,0,baos.size()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(null!=baos) {
					baos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
