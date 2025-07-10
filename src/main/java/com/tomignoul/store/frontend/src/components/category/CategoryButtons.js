import { categories } from "../../utils/categories.js";
import { handleCategoryClick } from "./SubCategoryButtons.js";

export function CategoryButtons() {
  return categories.map((category, index) => {
    const button = document.createElement("button");
    button.textContent = category;
    button.className = "dropdown-button";
    button.dataset.index = index;

    button.addEventListener("click", () => {
      handleCategoryClick(category);
    });

    return button;
  });
}
