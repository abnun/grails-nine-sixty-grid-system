// Define the resources for exposure via Resources plugin
modules = {
	'nine-sixty-grid-system' {
		resource id: 'reset', url: [plugin: 'nine-sixty-grid-system', dir: 'css/nine-sixty-grid-system', file: 'reset.css'],
				attrs: [media: 'all']
		resource id: 'text', url: [plugin: 'nine-sixty-grid-system', dir: 'css/nine-sixty-grid-system', file: 'text.css'],
				attrs: [media: 'all']
		resource id: '960', url: [plugin: 'nine-sixty-grid-system', dir: 'css/nine-sixty-grid-system', file: '960.css'],
				attrs: [media: 'all']
	}
}