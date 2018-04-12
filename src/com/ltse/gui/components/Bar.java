package com.ltse.gui.components;

import com.ltse.gui.exceptions.UIException;
import com.ltse.gui.exceptions.ValueException;

public class Bar extends Component {

    public Bar(String idComponent,
               int positionX,
               int positionY,
               int height,
               int width
    ) throws UIException, ValueException {
        super(idComponent, "Bar", positionX, positionY, height, width);
    }
}
