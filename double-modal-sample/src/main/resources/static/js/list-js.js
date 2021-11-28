var options = {
	valueNames: ['workName', 'workTypeJa', 'yearOfRelease'],
	item: '<tr><td class="workName"></td><td class="workTypeJa"></td><td class="yearOfRelease"></td></tr>',
	page: 5,
	pagination: true,
	innerWindow: 2,
};

var userList = new List('works', options, works);
