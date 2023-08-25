.class public final synthetic Lcom/daaw/up5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/em6;


# instance fields
.field public final synthetic a:Lcom/daaw/cq5;

.field public final synthetic b:Lcom/daaw/eq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cq5;Lcom/daaw/eq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/up5;->a:Lcom/daaw/cq5;

    iput-object p2, p0, Lcom/daaw/up5;->b:Lcom/daaw/eq5;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/up5;->a:Lcom/daaw/cq5;

    iget-object v1, p0, Lcom/daaw/up5;->b:Lcom/daaw/eq5;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/cq5;->d(Lcom/daaw/eq5;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;

    const/4 p1, 0x0

    return-object p1
.end method
