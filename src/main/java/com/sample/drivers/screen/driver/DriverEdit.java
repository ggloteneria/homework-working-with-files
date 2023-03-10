package com.sample.drivers.screen.driver;

import com.sample.drivers.screen.document.DocumentEdit;
import io.jmix.ui.ScreenBuilders;
import io.jmix.ui.action.Action;
import io.jmix.ui.screen.*;
import com.sample.drivers.entity.Driver;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Driver.edit")
@UiDescriptor("driver-edit.xml")
@EditedEntityContainer("driverDc")
public class DriverEdit extends StandardEditor<Driver> {

}