package nus.iss.day13workshopadrsbook;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day13WorkshopAdrsbookApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day13WorkshopAdrsbookApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws IOException {
		// mvn spring-boot:run -Dspring-boot.run.arguments="--dataDir=datafiles"

		if (args.containsOption("dataDir")) {
			final String dataDir = args.getOptionValues("dataDir").get(0);
			// ############## For File Creation ##############
			// File fileDir = new File(dataDir);
			// if (!fileDir.isFile()) {
			// fileDir.createNewFile();
			// }

			// ############## For Folder Creation ##############
			File newDirectory = new File(dataDir);
			if (newDirectory.exists()) {
				System.out.println("Directory already exists");
			} else {
				newDirectory.mkdir();
			}

		} else {
			// System.out.println("dataDir Not Defined !!! Apps is closing.....");
			// System.exit(0);

		}
	}

}
