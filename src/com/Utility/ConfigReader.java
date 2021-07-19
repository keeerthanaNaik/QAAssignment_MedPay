/**
 * 
 */
package com.Utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;



public class ConfigReader {

	Properties prop;

	public ConfigReader() {

		try {

			File src = new File("./src/com/utility/resources/Config.property");
			FileInputStream fs = new FileInputStream(src);

			prop = new Properties();
			prop.load(fs);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public String getUrl() {
		return prop.getProperty("url");
	}

	public String getDriverPathChrome() {
		return prop.getProperty("driver_path_chrome");
	}

	public String getDriverValueChrome() {
		return prop.getProperty("driver_value_chrome");
	}

	public String getDriverPathIE() {
		return prop.getProperty("driver_path_IE");
	}

	public String getDriverValueIE() {
		return prop.getProperty("driver_value_IE");
	}

	public String getUserName() {
		return prop.getProperty("eid");
	}

	public String getPassWord() {
		return prop.getProperty("password");
	}

	

	public String getUserNameElement() {
		return prop.getProperty("eid_element_xpath");
	}

	public String getPassWordElement() {
		return prop.getProperty("password_element_xpath");
	}

	public String getLoginButtonElement() {
		return prop.getProperty("Login");
	}
	
	public String getOkButton() {
		return prop.getProperty("OkButton");
	}
	
	//Login Scenario's
	
	//Negative scenario's
	
		public String getUserName1() {
			return prop.getProperty("email1");
		}
		public String getPassword1() {
			return prop.getProperty("password1");
		}
		public String getUserName2() {
			return prop.getProperty("email2");
		}
		public String getPassword2() {
			return prop.getProperty("password2");
		}
		public String getUserName3() {
			return prop.getProperty("email3");
		}
		public String getPassword3() {
			return prop.getProperty("password3");
		}
		public String getUserName4() {
			return prop.getProperty("email4");
		}
		public String getPassword4() {
			return prop.getProperty("password4");
		}
		public String getUserName5() {
			return prop.getProperty("email5");
		}
		public String getPassword5() {
			return prop.getProperty("password5");
		}
		public String getUserName6() {
			return prop.getProperty("email6");
		}
		public String getPassword6() {
			return prop.getProperty("password6");
		}
	
	
	
	//Orders Page
	public String getPlaceAnOrder() {
		return prop.getProperty("PlaceAnOrder");
	}
	public String getSubmitButton() {
		return prop.getProperty("Submit");
    }
	public String getPartnerOrderID() {
		return prop.getProperty("PartnerOrderID");
	}
	public String getPartnerOrderIDValue() {
		return prop.getProperty("PartnerOrderIDValue");
	}
	public String getPaymentCollection() {
		return prop.getProperty("PaymentCollection");
	}
	public String getDeliveryPartner() {
		return prop.getProperty("DeliveryPartner");
	}
	public String getName() {
		return prop.getProperty("Name");
	}
	public String getNameValue() {
		return prop.getProperty("NameValue");
	}
	public String getMobile() {
		return prop.getProperty("Mobile");
	}
	public String getMobileValue() {
		return prop.getProperty("MobileValue");
	}
	public String getAlternameMobile() {
		return prop.getProperty("AlternameMobile");
	}
	public String getAlternameMobileValue() {
		return prop.getProperty("AlternameMobileValue");
	}
	public String getEmail() {
		return prop.getProperty("Email");
	}
	public String getEmailValue() {
		return prop.getProperty("EmailValue");
	}
	public String getAddress() {
		return prop.getProperty("Address");
	}
	public String getAddressValue() {
		return prop.getProperty("AddressValue");
	}
	public String getLandMark() {
		return prop.getProperty("LandMark");
	}
	public String getLandMarkValue() {
		return prop.getProperty("LandMarkValue");
	}
	public String getPinCode() {
		return prop.getProperty("PinCode");
	}
	public String getPinCodeValue() {
		return prop.getProperty("PinCodeValue");
	}
	public String getCity() {
		return prop.getProperty("City");
	}
	public String getCityValue() {
		return prop.getProperty("CityValue");
	}
	public String getState() {
		return prop.getProperty("State");
	}
	public String getStateValue() {
		return prop.getProperty("StateValue");
	}
	public String getDoctor() {
		return prop.getProperty("Doctor");
	}
	public String getDoctorName() {
		return prop.getProperty("DoctorName");
	}
	public String getChooseFile() {
		return prop.getProperty("ChooseFile");
	}
	public String getChooseFileValue() {
		return prop.getProperty("ChooseFileValue");
	}
	public String getMedicineName() {
		return prop.getProperty("MedicineName");
	}
	public String getMedicineNameValue() {
		return prop.getProperty("MedicineNameValue");
	}
	public String getSelectMedicineName() {
		return prop.getProperty("SelectMedicine");
	}
	public String getCrossButton() {
		return prop.getProperty("CrossButton");
	}
	public String getYesButton() {
		return prop.getProperty("YesButton");
	}
	public String getReason() {
		return prop.getProperty("Reason");
	}
	
	public String getSubmitReason() {
		return prop.getProperty("SubmitReason");
	}
	public String getExportData() {
		return prop.getProperty("ExportData");
	}
	public String getMenu() {
		return prop.getProperty("Menu");
	}
	public String getLogOut() {
		return prop.getProperty("LogOut");
	}
	
}