import SwiftUI
import shared

class ListViewModel: ObservableObject {
    
    @Published var items: [String]
    
    var listClass = ListClass()
    
    init() {
        items = listClass.items as! [String]
    }
    
    func add(_ item: String) {
        listClass.add(item: item)
        self.items = listClass.items as! [String]
    }
    
    func removeItem(at index: Int) {
        listClass.removeItem(index: Int32(index))
        self.items = listClass.items as! [String]
    }
}

struct ContentView: View {
    
    @ObservedObject var viewModel = ListViewModel()
    
    @State var addingItem = false
    @State var newItem: String = ""
    
    var body: some View {
        VStack {
            Button("Add") {
                self.addingItem = true
            }
            if addingItem {
                HStack {
                    TextField("Enter new item", text: $newItem)
                    Button("Done") {
                        viewModel.add(newItem)
                        newItem = ""
                        addingItem = false
                    }
                }
            }
            List {
                ForEach(viewModel.items, id: \.self) { itemString in
                    Text(itemString)
                }
                .onDelete { set in
                    viewModel.removeItem(at: set.first ?? 0)
                }
            }
        }
    }
    
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
