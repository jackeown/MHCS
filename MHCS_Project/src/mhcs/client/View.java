package mhcs.client;

import java.util.Arrays;

import mhcs.client.Map;
import mhcs.storage.Model;
import mhcs.storage.TestCases;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.AudioElement;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.media.client.Audio;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class View implements EntryPoint {
  /**
  * The message displayed to the user when the server cannot be reached or
  * returns an error.
  */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";

  /**
  * This is the entry point method.
  */
  public void onModuleLoad() {
    final TabLayoutPanel tabPanel = new TabLayoutPanel(2.5, Unit.EM);
    final Panel loginPanel = new FlowPanel();
    final DockPanel modulesDock = new DockPanel();
    final DockPanel configDock = new DockPanel();
    final HorizontalPanel modulesWestHorPanel = new HorizontalPanel();
    final HorizontalPanel moduleCoordinates = new HorizontalPanel();
    final HorizontalPanel configHorPanel = new HorizontalPanel();
    final HorizontalPanel settingsUserPanel = new HorizontalPanel();
    final HorizontalPanel settingsPassPanel = new HorizontalPanel();
    final HorizontalPanel currentPassword = new HorizontalPanel();
    final HorizontalPanel newPassword = new HorizontalPanel();
    final HorizontalPanel confirmPassword = new HorizontalPanel();
    final SimplePanel weatherPanel = new SimplePanel();
    final VerticalPanel settingsPassVertPanel = new VerticalPanel();
    final VerticalPanel modulesWestVerPanel = new VerticalPanel();
    final VerticalPanel modulesCenterVerPanel = new VerticalPanel();
    final VerticalPanel modulesSouthVerPanel = new VerticalPanel();
    final VerticalPanel modulesEastVerPanel = new VerticalPanel();
    final VerticalPanel xPanel = new VerticalPanel();
    final VerticalPanel yPanel = new VerticalPanel();
    final VerticalPanel configVerPanel = new VerticalPanel();
    final VerticalPanel settingsVertPanel = new VerticalPanel();
    
    final Button submitButton = new Button("Log In");
    final Button modulesAddButton = new Button();
    final Button modulesRemoveButton = new Button();
    final Button roverPathButton = new Button();
    final Button deleteConfigButton = new Button();
    final Button buildConfigButton = new Button();
    final Button addUserButton = new Button();
    final Button removeUserButton = new Button();
    final Button changePasswordButton = new Button();
    final CheckBox radAirLock = new CheckBox("Air Lock");
    final CheckBox radPlain = new CheckBox("Plain");
    final CheckBox radDorm = new CheckBox("Dormitory");
    final CheckBox radSanitation = new CheckBox("Sanitation");
    final CheckBox radFoodAndWater = new CheckBox("Food & Water");
    final CheckBox radGymAndRelax = new CheckBox("Gym & Relaxation");
    final CheckBox radCanteen = new CheckBox("Canteen");
    final CheckBox radPower = new CheckBox("Power");
    final CheckBox radControl = new CheckBox("Control");
    final CheckBox radMedical = new CheckBox("Medical");
    final CheckBox passwordEnable = new CheckBox();
    final HTML moduleDetailsLabel = new HTML("Module Details");
    final HTML moduleRequirementsLabel = new HTML("Module Requirements");
    final HTML modulesLblId = new HTML("ID Number");
    final HTML modulesLblType = new HTML("Type");
    final HTML modulesLblCondition = new HTML("Condition");
    final HTML modulesLblOrientation = new HTML("Orientation");
    final HTML xCoordinate = new HTML("X-Coordinate");
    final HTML yCoordinate = new HTML("Y-Coordinate");
    final HTML changePassword = new HTML("Change Password");
    final HTML cPass = new HTML("Current Password");
    final HTML nPass = new HTML("New Password");
    final HTML coPass = new HTML("Current Password");
    final HTML weatherText = new HTML("Place holder for the weather");
    final Image modulesImage = new Image("images/image");
    final Image map = new Image("images/marsMap");
    final ListBox modulesListBox = new ListBox();
    final ListBox modulesEastType = new ListBox();
    final ListBox modulesEastCondition = new ListBox();
    final ListBox modulesEastOrientation = new ListBox();
    final ListBox configListBox = new ListBox();
    final ListBox users = new ListBox();
    final ListBox testCases = new ListBox();
    final PasswordTextBox cPassword = new PasswordTextBox();
    final PasswordTextBox nPassword = new PasswordTextBox();
    final PasswordTextBox coPassword = new PasswordTextBox();
    final RadioButton radAll = new RadioButton("Select All");
    final RadioButton radNone = new RadioButton("Deselect All");
    final TextArea moduleDetails = new TextArea();
    final TextArea moduleRequirements = new TextArea();
    final TextBox userNameEntry = new TextBox();
    final PasswordTextBox passwordEntry = new PasswordTextBox();
    final TextBox modulesEastId = new TextBox();
    final TextBox xTextBox = new TextBox();
    final TextBox yTextBox = new TextBox();
    
    final String strWidth1 = "1500px";
    final String strDockPanelSouth = "Naples Spring 2015";
    final int intPanelBorder = 2;
    final int intPanelSpacing0 = 5;
    final int intPanelSpacing1 = 10;
    final String strSettingsHeight = "20px";
    final String strButtonHeight = "50px"; 
    final String strSettingsButtonWidth = "130px";
    final String strModulesEastPanelWidthHalf = "140px";
    final String strModulesButtonWidth = "150px";
    final String strModulesCenterHeight = "175px";
    final String strModulesImageHeight = "200px";
    final String strModulesImageWidth = "250px";
    final String strWidth = "300px";
    final String strConfigMapHeight = "560px";
    final String strHeight = "600px";
    final String strConfigListBoxHeight = "650px";
    final String strModulesCenterWidth = "800px";
    final String strConfigMapWidth = "1000px";
    
    /* Create sounds */
    final Audio successSound = Audio.createIfSupported();
    successSound.setSrc("sounds/success");
    final Audio errorSound = Audio.createIfSupported();
    errorSound.setSrc("sounds/error");
    
    final TestCases test = new TestCases();

    final Map mapDisplay = new Map(100,50);    
    
    tabPanel.setAnimationDuration(1000);
    tabPanel.getElement().getStyle().setMarginBottom(10.0, Unit.PX);

    loginPanel.setHeight(strWidth1);
    loginPanel.add(new Label("Username:"));
    loginPanel.add(userNameEntry);
    loginPanel.add(new Label("Password:"));
    loginPanel.add(passwordEntry);
    loginPanel.add(submitButton);
    submitButton.addClickHandler(Controller.submitHandler(passwordEntry,
    		tabPanel, strSettingsButtonWidth, strModulesButtonWidth, errorSound));
    
    /*
     *  Modules
     */
    /* West */
    /* Inner Panels */
    // Add a list box with multiple selection enabled
    //Module.populateListBox(arrModules);
    modulesListBox.setVisibleItemCount(10);
    modulesListBox.setHeight(strHeight);
    modulesListBox.setWidth(strWidth);

    modulesListBox.clear();
	for (Module m : Model.getModuleList())
	{
		modulesListBox.addItem("Module #" + m.getId()); 
	}
    
	modulesListBox.addChangeHandler(Controller.changeHandler(modulesListBox,
			modulesEastId, modulesEastType, modulesEastCondition,
			modulesEastOrientation, xTextBox, yTextBox));
    
    /* Fill Horizontal Panel */
    modulesAddButton.setHeight(strButtonHeight);
    modulesAddButton.setWidth(strModulesButtonWidth);
    modulesRemoveButton.setHeight(strButtonHeight);
    modulesRemoveButton.setWidth(strModulesButtonWidth);
    modulesAddButton.setText("ADD");
    modulesRemoveButton.setText("REMOVE");
    
    modulesRemoveButton.addClickHandler(Controller.removeButton(modulesListBox));
    
    modulesWestHorPanel.add(modulesAddButton);
    modulesWestHorPanel.add(modulesRemoveButton);
    
//    modulesAddButton.addClickHandler(Handlers.addButton());

    /* Fill Vertical Panel */
    modulesWestVerPanel.add(modulesListBox);
    modulesWestVerPanel.add(modulesWestHorPanel);

    /* North */
    // Image to be filled with function based on module
    modulesImage.setHeight(strModulesImageHeight);
    modulesImage.setWidth(strModulesImageWidth);

    /* Center */
    moduleDetails.setHeight(strModulesCenterHeight);
    moduleDetails.setWidth(strModulesCenterWidth);
    modulesCenterVerPanel.add(moduleDetailsLabel);
    modulesCenterVerPanel.add(moduleDetails);

    /* South */
    moduleRequirements.setText("module requirements module requirements module requirements");
    moduleRequirements.setReadOnly(true);
    moduleRequirements.setHeight(strModulesCenterHeight);
    moduleRequirements.setWidth(strModulesCenterWidth);
    modulesSouthVerPanel.add(moduleRequirementsLabel);
    modulesSouthVerPanel.add(moduleRequirements);

    /* East */
    modulesEastId.setWidth(strWidth);

    // Via loop based off module array
    for (int i = 0; i < Module.moduleStrings.length; i++) {
      modulesEastType.addItem(Module.moduleStrings[i]);
    } //for
    modulesEastType.setVisibleItemCount(10);
    modulesEastType.setEnabled(false);
    modulesEastType.setWidth(strWidth);
    Controller.setType(modulesEastId, modulesEastType);
    
    // entered via loop based off array
    modulesEastCondition.addItem("Usable");
    modulesEastCondition.addItem("Damaged");
    modulesEastCondition.addItem("Unusable");
    modulesEastCondition.setVisibleItemCount(3);
    modulesEastCondition.setWidth(strWidth);

    // entered via loop based off array
    modulesEastOrientation.addItem("0 turns");
    modulesEastOrientation.addItem("1 turns");
    modulesEastOrientation.addItem("2 turns");
    modulesEastOrientation.setVisibleItemCount(3);
    modulesEastOrientation.setWidth(strWidth);

    xTextBox.setWidth(strModulesEastPanelWidthHalf);
    yTextBox.setWidth(strModulesEastPanelWidthHalf);
    xPanel.add(xCoordinate);
    xPanel.add(xTextBox);
    yPanel.add(yCoordinate);
    yPanel.add(yTextBox);
    moduleCoordinates.add(xPanel);
    moduleCoordinates.add(yPanel);

    Button modulesSaveButton = new Button();
    modulesSaveButton.setHeight(strButtonHeight);
    modulesSaveButton.setWidth(strWidth);
    modulesSaveButton.setText("SAVE");
    
    //modulesSaveButton.addClickHandler(Handlers.saveButton());

    modulesSaveButton.addClickHandler(new ClickHandler(){
		@Override
		public void onClick(ClickEvent event) {
			ModuleType type;
			int id;
			Point coordinates;
			ModuleStatus status;
			int orientation;
			boolean inUse;
			
			type = ModuleType.getTypeFromUserString(modulesEastType.getItemText(modulesEastType.getSelectedIndex()));
			id = Integer.parseInt(modulesEastId.getText());
		    coordinates = new Point(Integer.parseInt(xTextBox.getText()),Integer.parseInt(yTextBox.getText()));
		    status = ModuleStatus.getStatusFromUserString(modulesEastCondition.getItemText(modulesEastCondition.getSelectedIndex()));
		    orientation = modulesEastOrientation.getSelectedIndex();
			inUse = false;
			
			if(Model.saveModule(new Module(type,id,coordinates,status,orientation,inUse))) {
				successSound.play();
				/* 
                 * Add pop up for minimum config
                 */
			} // if
			else {
				errorSound.play();
			} // else
			
			modulesListBox.clear();
			for (Module m : Model.getModuleList())
			{
				modulesListBox.addItem("Module #" + m.getId());
			} // for
		} // onClick
    });
    
    modulesEastVerPanel.add(modulesLblId);
    modulesEastVerPanel.add(modulesEastId);
    modulesEastVerPanel.add(modulesLblType);
    modulesEastVerPanel.add(modulesEastType);
    modulesEastVerPanel.add(modulesLblCondition);
    modulesEastVerPanel.add(modulesEastCondition);
    modulesEastVerPanel.add(modulesLblOrientation);
    modulesEastVerPanel.add(modulesEastOrientation);
    modulesEastVerPanel.add(moduleCoordinates);
    modulesEastVerPanel.add(modulesSaveButton);
    modulesEastVerPanel.setSpacing(intPanelSpacing1 + 2);

    /* Create a Dock Panel */
    modulesDock.setSpacing(intPanelSpacing0);
    modulesDock.setHorizontalAlignment(DockPanel.ALIGN_CENTER);
    modulesDock.setBorderWidth(intPanelBorder);
    modulesDock.setSize(strWidth1, strHeight);

    /* Add panels to Dock */
    modulesDock.add(new HTML("Modules"), DockPanel.NORTH);
    modulesDock.add(new HTML(strDockPanelSouth), DockPanel.SOUTH);
    modulesDock.add(modulesEastVerPanel, DockPanel.EAST);
    modulesDock.add(modulesWestVerPanel, DockPanel.WEST);
    modulesDock.add(modulesImage, DockPanel.NORTH);
    modulesDock.add(modulesSouthVerPanel, DockPanel.SOUTH);
    modulesDock.add(modulesCenterVerPanel, DockPanel.CENTER);

    /* 
     * Configurations 
     */
    /* West */
    // Add a list box with multiple selection enabled
    //Configurations.populateListBox(configListBox);
    configListBox.setVisibleItemCount(10);
    configListBox.setHeight(strConfigListBoxHeight);
    configListBox.setWidth(strWidth);

    /* Center */
    map.setHeight(strConfigMapHeight);
    map.setWidth(strConfigMapWidth);
      
    /* East */
    radAirLock.setText("Air Lock");
    radPlain.setText("Plain");
    radDorm.setText("Dormitory");
    radSanitation.setText("Sanitation");
    radFoodAndWater.setText("Food & Water");
    radGymAndRelax.setText("Gym & Relaxation");
    radCanteen.setText("Canteen");
    radPower.setText("Power");
    radControl.setText("Control");
    radMedical.setText("Medical");
    radNone.setText("Deselect All");
    radAll.setText("Select All");
    radAll.setName("MapModules");
    radNone.setName("MapModules");
    configVerPanel.add(radAirLock);
    configVerPanel.add(radPlain);
    configVerPanel.add(radDorm);
    configVerPanel.add(radSanitation);
    configVerPanel.add(radFoodAndWater);
    configVerPanel.add(radGymAndRelax);
    configVerPanel.add(radCanteen);
    configVerPanel.add(radPower);
    configVerPanel.add(radControl);
    configVerPanel.add(radMedical);
    configVerPanel.add(radAll);
    configVerPanel.add(radNone);
    
    configVerPanel.setHeight(strHeight);
      
    /* 2nd South */
    roverPathButton.setHeight(strButtonHeight);
    roverPathButton.setWidth(strWidth);
    deleteConfigButton.setHeight(strButtonHeight);
    deleteConfigButton.setWidth(strWidth);
    buildConfigButton.setHeight(strButtonHeight);
    buildConfigButton.setWidth(strWidth);
    roverPathButton.setText("Rover Path");
    deleteConfigButton.setText("Delete Configuration");
    buildConfigButton.setText("Build Configuration");
    configHorPanel.add(roverPathButton);
    configHorPanel.add(deleteConfigButton);
    configHorPanel.add(buildConfigButton);

    /* Create ConfigurationDock Panel */
    configDock.setSpacing(intPanelSpacing0);
    configDock.setHorizontalAlignment(DockPanel.ALIGN_CENTER);
    configDock.setBorderWidth(intPanelBorder);
    configDock.setSize(strWidth1, strHeight);

    /* Add to dock */
    configDock.add(new HTML("Configurations"), DockPanel.NORTH);
    configDock.add(new HTML(strDockPanelSouth), DockPanel.SOUTH);
    configDock.add(configVerPanel, DockPanel.EAST);
    configDock.add(configListBox, DockPanel.WEST);
    configDock.add(mapDisplay.getGrid(), DockPanel.CENTER);
    configDock.add(new HTML("Map"), DockPanel.NORTH);
    configDock.add(configHorPanel, DockPanel.SOUTH);
    mapDisplay.updateGrid();
    //    configDock.add(map, DockPanel.CENTER);

    /* 
     * Settings
     */    
    /* Vertical Panel (holds all) */
    /* Horizontal Panels */
    addUserButton.setText("Add User");
    removeUserButton.setText("Remove User");
    addUserButton.setHeight(strSettingsHeight);
    addUserButton.setWidth(strSettingsButtonWidth);
    removeUserButton.setHeight(strSettingsHeight);
    removeUserButton.setWidth(strSettingsButtonWidth);
    settingsUserPanel.add(users);
    settingsUserPanel.add(addUserButton);
    settingsUserPanel.add(removeUserButton);
    settingsUserPanel.setSpacing(intPanelSpacing1);
    
    testCases.addItem("No Test Case Selected");
    testCases.addItem("Test Case 1");
    testCases.addItem("Test Case 2");
    testCases.addItem("Test Case 3");
    testCases.addItem("Test Case 4");
    testCases.addItem("Test Case 5");
    testCases.addItem("Test Case 6");
    testCases.addItem("Test Case 7");
    testCases.addItem("Test Case 8");
    testCases.addItem("Test Case 9");
    testCases.addItem("Test Case 10");  
    testCases.setVisibleItemCount(1);
    testCases.setWidth(strWidth); 
    testCases.addChangeHandler(Controller.testCases(testCases));    

    passwordEnable.setText("Password Enabled");
    passwordEnable.setHeight(strSettingsHeight);
    changePasswordButton.setText("Change Password");
    changePasswordButton.setHeight(strSettingsHeight);
    changePasswordButton.setWidth(strSettingsButtonWidth);
    settingsPassPanel.add(passwordEnable);
    settingsPassPanel.add(changePasswordButton);
    settingsPassPanel.setSpacing(intPanelSpacing1);

    /* Inner vertical panel */
    changePassword.setHeight(strSettingsHeight);
    settingsPassVertPanel.setSpacing(intPanelSpacing0);

    /* Inner horizontal panels */
    currentPassword.add(cPassword);
    currentPassword.add(cPass);
    currentPassword.setSpacing(intPanelSpacing1);

    newPassword.add(nPassword);
    newPassword.add(nPass);
    newPassword.setSpacing(intPanelSpacing1);

    confirmPassword.add(coPassword);
    confirmPassword.add(coPass);
    confirmPassword.setSpacing(intPanelSpacing1);

    settingsPassVertPanel.add(changePassword);
    settingsPassVertPanel.add(currentPassword);
    settingsPassVertPanel.add(newPassword);
    settingsPassVertPanel.add(confirmPassword);
    settingsPassVertPanel.setSpacing(intPanelSpacing0);
    settingsPassVertPanel.setBorderWidth(intPanelBorder);

    settingsVertPanel.add(testCases);
    settingsVertPanel.add(settingsUserPanel);
    settingsVertPanel.add(settingsPassPanel);
    settingsVertPanel.add(settingsPassVertPanel);
    settingsVertPanel.setSpacing(intPanelSpacing1);
    settingsVertPanel.setBorderWidth(intPanelBorder);
    
    
    /* Weather Panel */
//    weatherPanel.add(weatherText);
//    Weather weather = new Weather();
//    weather.requestData(weather.strURL);
//    weatherPanel.add(new Label("Current temp: \t" + weather.strTemp + " Celsius"));
//    weatherPanel.add(new Label("Current visibility: \t" + weather.strVisibility + " km"));
    
//    RootPanel.get().add(configDock);
//    RootPanel.get().add(modulesDock);
//    RootPanel.get().add(settingsVertPanel);
    
    /* Add tabs to layout */
    tabPanel.add(modulesDock, "Modules");
    tabPanel.add(configDock, "Configurations");
    tabPanel.add(settingsVertPanel, "Settings");
    tabPanel.add(weatherPanel, "Weather");
    tabPanel.add(new HTML("Logout"), "Logout");
    
//    RootLayoutPanel.get().add(tabPanel);
    RootLayoutPanel.get().add(loginPanel);

  } // OnModuleLoad
} // View
