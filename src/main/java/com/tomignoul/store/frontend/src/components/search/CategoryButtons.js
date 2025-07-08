import { categories } from "../../utils/categories";

export function CategoryButtons() {
  return categories.map((category, index) => {
    const button = document.createElement("button");
    button.textContent = category;
    button.classname = "dropdown-button";
    button.dataset.index = index;
    return button;
  });
}
