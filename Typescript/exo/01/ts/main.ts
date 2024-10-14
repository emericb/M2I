interface Author {
    name: string;
    birthYear: Date;
    genres: string[];
}

interface Book {
    title: string;
    author: Author;
    pages: number;
    isAvailable: boolean;
}

function createBook(title: string, author: Author, pages: number): Book {
    return {
        title,
        author,
        pages,
        isAvailable: true
    };
}

function toggleAvailability(book: Book): void {
    book.isAvailable = !book.isAvailable;
}

class Library {
    books: Book[];

    constructor(books: Book[] = []) {
        this.books = books;
    }

    addBook(book: Book): void {
        this.books.push(book);
    }

    removeBook(title: string): void {
        this.books = this.books.filter(book => book.title !== title);
    }

    findBookByTitle(title: string): Book | undefined {
        return this.books.find(book => book.title === title);
    }

    listAvailableBooks(): Book[] {
        return this.books.filter(book => book.isAvailable);
    }

    getBooksByAuthor(authorName: string): Book[] {
        return this.books.filter(book => book.author.name === authorName);
    }
}

const library = new Library([]);

const author1: Author = { name: 'Author1', birthYear: new Date(1970, 1, 1), genres: ['Fiction'] };
const author2: Author = { name: 'Author2', birthYear: new Date(1980, 1, 1), genres: ['Science'] };

const book1 = createBook('Book1', author1, 100);
const book2 = createBook('Book2', author2, 200);
const book3 = createBook('Book3', author1, 300);

library.addBook(book1);
library.addBook(book2);
library.addBook(book3);

console.log('List of available books:', library.listAvailableBooks());
console.log('List of books by Author1:', library.getBooksByAuthor('Author1'));
console.log('Search for Book1:', library.findBookByTitle('Book1'));

toggleAvailability(book1);
console.log('List of available books after toggling availability of Book1:', library.listAvailableBooks());

library.removeBook('Book1');
console.log('List of available books after removing Book1:', library.listAvailableBooks());
