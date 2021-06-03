import { Postagem } from "./Postagem"

export class Categoria{
    public id: number
    public descricao: string
    public postagem: Postagem[]
}