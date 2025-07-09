import { categories, subcategories } from "../../utils/categories";

export function CategoryButtons() {
  return categories.map((category, index) => {
    const button = document.createElement("button");
    button.textContent = category;
    button.classname = "dropdown-button";
    button.dataset.index = index;
    return button;
  });
}

export function SubCategoryButtons() {
  return subcategories.map((subcatogry, index) => {
    const subRadioButton = document.createElement("subRadioButton");
    subRadioButton.textContent = subcatogry;
    subRadioButton.classname = "radio-button";
  });
}
