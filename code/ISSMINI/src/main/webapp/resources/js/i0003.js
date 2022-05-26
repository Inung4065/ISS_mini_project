	function fn_prev(page, range, rangeSize, user) {

		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;

		var url = "board.do";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		url = url + "&user=" + user;

		location.href = url;
	}

	function fn_pagination(page, range, rangeSize, user) {

		var url = "board.do";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		url = url + "&user=" + user;

		location.href = url;	
	}

	function fn_next(page, range, rangeSize, user) {

		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;

		var url = "board.do";
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		url = url + "&user=" + user;

		location.href = url;
	}