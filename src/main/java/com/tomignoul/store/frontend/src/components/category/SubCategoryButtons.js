import { subcategories } from "../../utils/categories.js";

export function handleCategoryClick(categoryName) {
  const container = document.getElementById("subcategory-container");

  container.innerHTML = "";

  const subs = subcategories[categoryName];
  if (!subs || subs.length === 0) {
    container.textContent = "Geen subcategorieën beschikbaar.";
    return;
  }

  subs.forEach((subcat, index) => {
    const label = document.createElement("label");
    label.textContent = subcat;
    label.style.display = "block";

    const radio = document.createElement("input");
    radio.type = "radio";
    radio.name = "subcategorie";
    radio.value = subcat;
    radio.id = `subcat-${index}`;

    label.prepend(radio);
    container.appendChild(label);
  });
}
