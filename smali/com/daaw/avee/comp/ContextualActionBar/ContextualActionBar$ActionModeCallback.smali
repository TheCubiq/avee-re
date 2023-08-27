.class Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;
.super Ljava/lang/Object;
.source "ContextualActionBar.java"

# interfaces
.implements Landroidx/appcompat/view/ActionMode$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ActionModeCallback"
.end annotation


# instance fields
.field actionsToShow:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;


# direct methods
.method private constructor <init>(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->actionsToShow:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$1;)V
    .locals 0

    .line 205
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;-><init>(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)V

    return-void
.end method


# virtual methods
.method public onActionItemClicked(Landroidx/appcompat/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 6

    .line 229
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const v3, 0x7f090042

    if-ne v0, v3, :cond_5

    .line 230
    invoke-interface {p2}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    .line 231
    invoke-interface {p1}, Landroid/view/SubMenu;->clear()V

    .line 233
    iget-object p2, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    invoke-static {p2}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->access$200(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)Ljava/util/HashMap;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    move-result p2

    .line 236
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->actionsToShow:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-lez p2, :cond_3

    .line 238
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    invoke-static {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->access$300(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 240
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " count: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 242
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, p2, :cond_0

    .line 243
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getShouldShow()Z

    move-result v4

    if-eqz v4, :cond_0

    if-ne p2, v2, :cond_1

    .line 244
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->isAllowSingle()Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    if-le p2, v2, :cond_0

    .line 245
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->isAllowMultiple()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 246
    :cond_2
    iget-object v4, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->actionsToShow:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    .line 254
    :goto_1
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->actionsToShow:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_4

    add-int/lit8 v0, p2, 0xa

    .line 255
    iget-object v3, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->actionsToShow:Ljava/util/List;

    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v3}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getActionId()I

    move-result v3

    iget-object v4, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->actionsToShow:Ljava/util/List;

    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v4}, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;->getNameStrResId()I

    move-result v4

    invoke-interface {p1, v1, v0, v3, v4}, Landroid/view/SubMenu;->add(IIII)Landroid/view/MenuItem;

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_4
    return v2

    .line 262
    :cond_5
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    add-int/lit8 p2, p2, -0xa

    if-ltz p2, :cond_7

    .line 263
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    invoke-static {v0}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->access$300(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-ge p2, v0, :cond_7

    .line 265
    sget-object v0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onRequestContextData:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/ContextData;

    if-eqz v0, :cond_6

    .line 268
    iget-object v3, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    iget-object v4, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->actionsToShow:Ljava/util/List;

    invoke-interface {v4, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;

    invoke-virtual {v3, v0, p2}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->executeAction(Lcom/daaw/avee/ContextData;Lcom/daaw/avee/comp/ContextualActionBar/ItemActionBase;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 269
    invoke-virtual {p1}, Landroidx/appcompat/view/ActionMode;->finish()V

    return v2

    :cond_6
    const-string p1, "onRequestContextData returned null"

    .line 273
    invoke-static {p1}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    :cond_7
    return v1
.end method

.method public onCreateActionMode(Landroidx/appcompat/view/ActionMode;Landroid/view/Menu;)Z
    .locals 2

    .line 211
    iget-object v0, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->access$102(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;Z)Z

    .line 212
    invoke-virtual {p1}, Landroidx/appcompat/view/ActionMode;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object p1

    const/high16 v0, 0x7f0d0000

    invoke-virtual {p1, v0, p2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const p1, 0x7f090042

    .line 214
    invoke-interface {p2, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    .line 215
    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    const/4 p1, 0x1

    return p1
.end method

.method public onDestroyActionMode(Landroidx/appcompat/view/ActionMode;)V
    .locals 1

    .line 283
    iget-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->access$402(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;Landroidx/appcompat/view/ActionMode;)Landroidx/appcompat/view/ActionMode;

    .line 286
    iget-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    invoke-static {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->access$100(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 287
    iget-object p1, p0, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar$ActionModeCallback;->this$0:Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;

    invoke-static {p1}, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->access$500(Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;)V

    .line 290
    :cond_0
    sget-object p1, Lcom/daaw/avee/comp/ContextualActionBar/ContextualActionBar;->onSelectModeChanged:Lcom/daaw/avee/Common/Events/WeakEvent1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method

.method public onPrepareActionMode(Landroidx/appcompat/view/ActionMode;Landroid/view/Menu;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
