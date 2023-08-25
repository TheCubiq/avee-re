.class public Lcom/daaw/n40;
.super Lcom/daaw/m40;
.source ""

# interfaces
.implements Lcom/daaw/ni1;


# instance fields
.field public final q:Landroid/database/sqlite/SQLiteStatement;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteStatement;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/m40;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    iput-object p1, p0, Lcom/daaw/n40;->q:Landroid/database/sqlite/SQLiteStatement;

    return-void
.end method


# virtual methods
.method public S()J
    .locals 2

    iget-object v0, p0, Lcom/daaw/n40;->q:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    move-result-wide v0

    return-wide v0
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/n40;->q:Landroid/database/sqlite/SQLiteStatement;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    move-result v0

    return v0
.end method
