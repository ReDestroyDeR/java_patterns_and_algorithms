package red.patterns.creational.factory.alpha.model;

import java.util.Objects;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Boat {
   private String model;
   private Double length;
   private Double width;
   private Double depth;
   private Engine engine;

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public Double getLength() {
      return length;
   }

   public void setLength(Double length) {
      this.length = length;
   }

   public Double getWidth() {
      return width;
   }

   public void setWidth(Double width) {
      this.width = width;
   }

   public Double getDepth() {
      return depth;
   }

   public void setDepth(Double depth) {
      this.depth = depth;
   }

   public Engine getEngine() {
      return engine;
   }

   public void setEngine(Engine engine) {
      this.engine = engine;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Boat boat = (Boat) o;
      return Objects.equals(model, boat.model)
              && length.equals(boat.length)
              && width.equals(boat.width)
              && depth.equals(boat.depth)
              && Objects.equals(engine, boat.engine);
   }

   @Override
   public int hashCode() {
      return Objects.hash(model, length, width, depth, engine);
   }

   @Override
   public String toString() {
      return "Boat{" +
              "model='" + model + '\'' +
              ", length=" + length +
              ", width=" + width +
              ", depth=" + depth +
              ", engine=" + engine +
              '}';
   }
}
