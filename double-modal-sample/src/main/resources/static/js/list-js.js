var data = document.getElementById('target');
console.log(data);

var options = {
	valueNames: ['workName', 'workTypeJa', 'yearOfRelease'],
	//item: '<tr><td class="workName"></td><td class="workTypeJa"></td><td class="yearOfRelease"></td></tr>',

	item: function(values) {
		return `<tr>
				<td>${values.workName}</td>
				<td>${values.workTypeJa}</td>
				<td>${values.yearOfRelease}</td>
				<td><button onclick="openDiv('詳細情報')">詳細</button></td>
				</tr>`;
	},

	page: 5,
	pagination: true,
	innerWindow: 2,
};

var userList = new List('works', options, works);
