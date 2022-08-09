package com.alex.travel.derby.views.about;

import com.alex.travel.derby.views.MainLayout; // Import UI components
import com.vaadin.flow.component.html.H2; // Import flow HTML components
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle; // Import PageTitle and Route components
import com.vaadin.flow.router.Route;

@PageTitle("About B&B")
@Route(value = "about", layout = MainLayout.class) // Create navigation route
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSpacing(false);

        Image img = new Image("images/travel.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        add(new H2("About B&B"));
        add(new Paragraph("‘Book & Board (B&B)’ is a high street travel agency doing business since 1975, with four branches across UK and a headquarter in London.\n" +
                "‘B&B’ offers three types of services; travel plans, travel and hotel packages and complete holiday packages (hotels, flights, car rentals, insurance etc."));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}
