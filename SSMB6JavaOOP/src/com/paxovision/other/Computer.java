package com.paxovision.other;

public class Computer {
	private String name;
	private MatherBoard matherBoard;
	private Ram ram;
	private Processor processor = null;
	
	public Computer() {
		
	}
	public Computer(String name) {	
		this.name = name;
		this.matherBoard = new MatherBoard();
		processor = new Processor();
		processor.speed = 90;
		ram = new Ram();
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MatherBoard getMatherBoard() {
		return matherBoard;
	}
	
	public Ram getRam() {
		return ram;
	}

	public Processor getProcessor() {
		return processor;
	}



	@Override
	public String toString() {
		return "Computer [name=" + name + ", matherBoard=" + matherBoard + ", ram=" + ram + ", processor=" + processor
				+ "]";
	}






	public static class Ram {
		private String ramType;
		private int size;
		
		public Ram() {
		}

		public String getRamType() {
			return ramType;
		}

		public void setRamType(String ramType) {
			this.ramType = ramType;
		}

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		@Override
		public String toString() {
			return "Ram [ramType=" + ramType + ", size=" + size + "]";
		}
		

	}
	
	public class Processor{
		private String processorType;
		private int speed;
		
		public Processor() {
			name = "Test";
		}

		public String getProcessorType() {
			return processorType;
		}

		public void setProcessorType(String processorType) {
			this.processorType = processorType;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		@Override
		public String toString() {
			return "Processor [processorType=" + processorType + ", speed=" + speed + "]";
		}
		
		

	}
}

