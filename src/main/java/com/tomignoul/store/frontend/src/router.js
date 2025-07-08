import { renderLanding } from "./pages/landing";
import { renderSearch } from "./pages/search";

export function setupRouter() {
  function route() {
    const hash = window.location.hash;

    if (hash === "#search") {
      renderSearch(); // ✅ correct aangeroepen
    } else {
      renderLanding();
    }
  }

  window.addEventListener("hashchange", route);
  route(); // initial load
}
