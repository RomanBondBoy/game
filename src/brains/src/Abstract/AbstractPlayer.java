package brains.src.Abstract;

import area.Interfaces.IArea;
import brains.src.Interfaces.IPlayer;
import visual.src.Interfaces.IVisual;

import java.awt.*;

/**
 * @author Roman
 */
public abstract class AbstractPlayer implements IPlayer {

    /**
     * Ссылка на игровую область
     */
    protected IArea Area;

    /**
     * Цвет игрока
     */
    protected Color Color;

    /**
     * Ссылка на объект реализующий визуал
     */
    protected IVisual Visual;

    /**
     * Номер хода
     */
    protected int stepNumber = 0;

    /**
     * Имя игрока
     */
    protected String Name;

    /**
     * Базовый конструктор AbstractPlayer
     *
     * @param Area   IArea
     * @param Color  Color
     * @param Visual IVisual
     * @param Name   String
     */
    public AbstractPlayer(IArea Area, Color Color, IVisual Visual, String Name) {
        this.Area = Area;
        this.Color = Color;
        this.Visual = Visual;
        this.Name = Name;
    }

    /**
     * @return Возвращает числовой лог
     */
    public abstract int step();

    /**
     * Метод возвращает цвет
     *
     * @return Тип Color
     */
    public Color getColor() {
        return this.Color;
    }

    /**
     * @param timeMilSecs Кол-во миллисекунд
     */
    protected int returnZero(int timeMilSecs) {
        try {
            Thread.sleep(timeMilSecs);
        } catch (Exception e) {
            this.Visual.sendMessage(e.getMessage(), true, true);
        }
        this.stepNumber++;
        return 0;
    }
}
