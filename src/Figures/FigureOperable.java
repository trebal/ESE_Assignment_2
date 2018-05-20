package Figures;

import Operations.FigureVisitor;

public interface FigureOperable {
    Figure accept(FigureVisitor figureVisitor);
}
