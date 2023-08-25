.class public final synthetic Lcom/daaw/aq5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/cq5;

.field public final synthetic b:Lcom/daaw/p04;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cq5;Lcom/daaw/p04;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/aq5;->a:Lcom/daaw/cq5;

    iput-object p2, p0, Lcom/daaw/aq5;->b:Lcom/daaw/p04;

    iput-object p3, p0, Lcom/daaw/aq5;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/aq5;->a:Lcom/daaw/cq5;

    iget-object v1, p0, Lcom/daaw/aq5;->b:Lcom/daaw/p04;

    iget-object v2, p0, Lcom/daaw/aq5;->c:Ljava/lang/String;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, v1, v2}, Lcom/daaw/cq5;->E(Landroid/database/sqlite/SQLiteDatabase;Lcom/daaw/p04;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
