function formatDate(lastUpdated) {
  var date = new Date(lastUpdated);
  var year = date.getFullYear();
  var month = ("0" + (date.getMonth() + 1)).slice(-2); // Month is 0-indexed, so add 1
  var day = ("0" + date.getDate()).slice(-2);
  var hours = ("0" + date.getHours()).slice(-2);
  var minutes = ("0" + date.getMinutes()).slice(-2);
  var seconds = ("0" + date.getSeconds()).slice(-2);
  return `${year}-${month}-${day} ${hours}:${minutes}:${seconds} HKT`;
}

$(document).ready(function () {
  setInterval(function () {
    $.ajax({
      url: "/coinlist",
      type: "GET",
      success: function (data) {
        console.log(data);
        data.forEach(function (coin, index) {
          var row = $(`tr[data-coin-id='${coin.id}']`);
          if (row.length) {
            // jQuery
            // current Price
            row
              .find("td:nth-child(2)")
              .text("$" + coin.current_price.toFixed(2));
            // market Cap
            row
              .find("td:nth-child(4)")
              .text("$" + coin.market_cap.toLocaleString());
            // last updated datetime (HKT)
            row.find(".last-updated").text(formatDate(coin.last_updated));
            // Price Change Percentage
            var priceClass =
              coin.price_change_percentage_24h > 0
                ? "up"
                : coin.price_change_percentage_24h < 0
                ? "down"
                : "neutral";
            var priceChangeIcon =
              coin.price_change_percentage_24h > 0
                ? "▲"
                : coin.price_change_percentage_24h < 0
                ? "▼"
                : "-";
            var priceChangeValue =
              Math.abs(coin.price_change_percentage_24h).toFixed(2) + "%";
            row
              .find(".price-change")
              .removeClass("up down neutral")
              .addClass(priceClass)
              .html(`${priceChangeIcon} ${priceChangeValue}`)
              ;
          }
        });
      },
    });
  }, 30000); // 30 seconds
});
