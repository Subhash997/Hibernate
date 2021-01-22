import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.DAO.CarDAO;
import com.xworkz.DAO.CarMDAOImpl;
import com.xworkz.DTO.Car;

public class CarTester {

	
	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(new File("C:\\Users\\DELL\\Desktop\\Car.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row;
		
			
			for(int i=1;i<=sheet.getLastRowNum();i++) {
	        	row = (Row) sheet.getRow(i);
	        	
				String ID;
				if (row.getCell(0) == null) {
					ID = "null";
				} else
					ID = row.getCell(0).toString();
	        	
	        	String Model;
	        	if(row.getCell(1)==null) {Model ="null";}
	        	else Model=row.getCell(1).toString();
	        	
	        	String Company;
	        	if(row.getCell(2)==null) { Company="false";}
	        	else Company=row.getCell(2).toString();
	        	
	        	String Cost;
	        	if(row.getCell(3)==null) { Cost="0.00";}
	        	else Cost=row.getCell(3).toString();


			Car car = new Car();
			car.setId(Double.parseDouble(ID));
			car.setModel(Model);
			car.setCompany(Company);
			car.setCost(Double.parseDouble(Cost));

			CarDAO carMImpl = new CarMDAOImpl();
			carMImpl.insertCar(car);

		}workbook.close();

}
}
