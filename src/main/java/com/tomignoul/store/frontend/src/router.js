import { renderLanding } from "./pages/landing";

export function setupRouter() {
  function route() {
    const hash = window.location.hash;

    if (hash == "#search") {
    } else {
      renderLanding();
    }
  }

  window.addEventListener("hashchange", route);
  route();
}
