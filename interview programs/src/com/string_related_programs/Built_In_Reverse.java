package com.string_related_programs;
import java.util.*;
public class Built_In_Reverse
{
	void string_Buffer()
	{
		System.out.println("Using String Buffer");
		String str = "Geeks";
	    // conversion from String object to StringBuffer
	    StringBuffer sbr = new StringBuffer(str);
	    // To reverse the string
	    sbr.reverse();
	    System.out.println(sbr);
	}
	void string_Builder()
	{
		System.out.println("Using String Builder");
		String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();     // used string builder to reverse
       System.out.println(str2);
	}
}
