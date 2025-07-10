import { CategoryButtons } from "../components/category/CategoryButtons.js";

export function renderSearch() {
  const app = document.getElementById("app");

  app.innerHTML = `
    <section>
      <h2>Categorieën</h2>
      <div id="category-container"></div>
          <h3>Kies een subcategorie:</h3>
    <div id="subcategory-container"></div>
    </section>
  `;

  const container = document.getElementById("category-container");
  const buttons = CategoryButtons();

  buttons.forEach((button) => {
    container.appendChild(button);
  });
}
