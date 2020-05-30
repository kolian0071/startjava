public class Variable {
	public static void main(String[] args) {
		byte numUsers = 1; //количество пользователей
		short numCores = 2; //число ядер процессора
		int numThreads = 4; //количество потоков процессора
		long sizeRAM = 16; //размер оперативной памяти
		float memoryFreq = 1195.9f; //частота оперативной памяти
		double cpuFreq = 3.20; // частота процессора
		char numDisplays = '1'; //число монитров
		boolean printer = false; //наличие принтера

		System.out.println(numUsers);
		System.out.println(numCores);
		System.out.println(numThreads);
		System.out.println(sizeRAM);
		System.out.println(memoryFreq);
		System.out.println(cpuFreq);
		System.out.println(numDisplays);
		System.out.println(printer);
	}
}