export function renderLanding() {
  const app = document.getElementById("app");
  app.innerHTML = `
    <section class="landing">
      <h1>Welkom bij Mijn Store</h1>
      <p>Zoek en ontdek de beste producten op één plek.</p>
      <a href="#search" class="start-button">Start zoeken</a>
    </section>
  `;
}
