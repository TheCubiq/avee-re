.class public Lcom/daaw/m40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/li1;


# instance fields
.field public final p:Landroid/database/sqlite/SQLiteProgram;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteProgram;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m40;->p:Landroid/database/sqlite/SQLiteProgram;

    return-void
.end method


# virtual methods
.method public F(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m40;->p:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteProgram;->bindNull(I)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m40;->p:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteProgram;->close()V

    return-void
.end method

.method public i(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m40;->p:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    return-void
.end method

.method public m(ID)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m40;->p:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindDouble(ID)V

    return-void
.end method

.method public r(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m40;->p:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2, p3}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    return-void
.end method

.method public x(I[B)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/m40;->p:Landroid/database/sqlite/SQLiteProgram;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteProgram;->bindBlob(I[B)V

    return-void
.end method
