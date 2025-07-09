import { SubCategoryButtons } from "../Category/CategoryButtons";

export function SubCategoryButtons() {
  return subcategories.map((subcatogry, index) => {
    const subRadioButton = document.createElement("subRadioButton");
    subRadioButton.textContent = subcatogry;
    subRadioButton.classname = "radio-button";
    subRadioButton.button.dataset.index = index;
  });
}
