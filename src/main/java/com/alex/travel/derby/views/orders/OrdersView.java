package com.alex.travel.derby.views.orders;

import com.alex.travel.derby.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Orders")
@Route(value = "orders", layout = MainLayout.class)
public class OrdersView extends VerticalLayout {

    public OrdersView() {
        setSpacing(false);

        Image img = new Image("images/travel.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        add(new H2("Coming soon"));
        add(new Paragraph("Work in progress"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}