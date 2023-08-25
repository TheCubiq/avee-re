.class public final synthetic Lcom/daaw/i71;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$d;


# instance fields
.field public final synthetic a:Lcom/daaw/f91;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f91;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i71;->a:Lcom/daaw/f91;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/i71;->a:Lcom/daaw/f91;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method
