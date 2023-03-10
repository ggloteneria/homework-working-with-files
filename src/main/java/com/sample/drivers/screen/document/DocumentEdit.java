package com.sample.drivers.screen.document;

import io.jmix.ui.UiComponents;
import io.jmix.ui.action.BaseAction;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.Component;
import io.jmix.ui.component.LinkButton;
import io.jmix.ui.download.Downloader;
import io.jmix.ui.model.InstanceContainer;
import io.jmix.ui.screen.*;
import com.sample.drivers.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
public class DocumentEdit extends StandardEditor<Document> {
    @Autowired
    private UiComponents uiComponents;
    @Autowired
    private Downloader downloader;
    @Autowired
    private InstanceContainer<Document> documentDc;


//    @Install(to = "attachmentField", subject = "columnGenerator")
//    private Component documentEditAttachmentColumnGenerator(Document document) {
//        LinkButton linkButton = uiComponents.create(LinkButton.class);
//        linkButton.setCaption(documentDc.getItem().getAttachment().getFileName());
//
//        linkButton.setAction(new BaseAction("download").withHandler(actionPerformedEvent ->
//                downloader.download(documentDc.getItem().getAttachment())));
//        return linkButton;
//    }
//
//    @Subscribe("linkBtn")
//    public void onAttachmentClick(Button.ClickEvent event) {
//        LinkButton linkButton = uiComponents.create(LinkButton.class);
//        linkButton.setCaption(documentDc.getItem().getAttachment().getFileName());
//
//        linkButton.setAction(new BaseAction("download").withHandler(actionPerformedEvent ->
//        downloader.download(documentDc.getItem().getAttachment())));
//
//
//    }
}