package Figures;

import Operations.FigureVisitor;

/**
 * An interface that implement all <b>Figure</b>, and allows to accept visitors in order to use the Visitor pattern.
 */
public interface FigureOperable {
    /**
     * Tha accept method allows visitors to make changes (which actually are new Figures as result).
     * @param figureVisitor A visitor.
     * @return A new <b>Figure</b>.
     */
    Figure accept(FigureVisitor figureVisitor);
}
