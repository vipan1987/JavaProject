package com.paxovision.other;

import com.paxovision.other.Computer.Processor;
import com.paxovision.other.Computer.Ram;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new Computer("Mac");
		
		computer.getMatherBoard().setName("X3");
		computer.getMatherBoard().setMsg("Intel");
		
		computer.getRam().setRamType("DDR3");
		computer.getRam().setSize(8);
		System.out.println(computer.getRam());
		
		
		
		computer.getProcessor().setProcessorType("Intel");
		computer.getProcessor().setSpeed(3);
		System.out.println(computer.getProcessor());
		
		System.out.println(computer);
		
		
		Ram r;
		Processor p;
		
		Computer.Ram r2 = new Ram();
		
	}

}
